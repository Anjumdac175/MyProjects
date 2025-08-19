import { useEffect, useState } from "react";
import api from "../services/api";

export default function ComplaintTable() {
  const [items, setItems] = useState([]);
  const [q, setQ] = useState("");
  const [area, setArea] = useState("");
  const [status, setStatus] = useState("");
  const [page, setPage] = useState(0);
  const [size] = useState(10);
  const [totalPages, setTotalPages] = useState(0);
  const [refreshKey, setRefreshKey] = useState(0);

  const load = async () => {
    const params = new URLSearchParams({ page, size, sort: "updatedAt,DESC" });
    if (q) params.append("q", q);
    if (area) params.append("area", area);
    if (status) params.append("status", status);
    const res = await api.get(`/complaints?${params.toString()}`);
    setItems(res.data.content);
    setTotalPages(res.data.totalPages);
  };

  useEffect(() => { load(); /* eslint-disable-next-line */ }, [page, refreshKey]);

  const updateStatus = async (id, newStatus) => {
    await api.patch(`/complaints/${id}/status`, { status: newStatus });
    setRefreshKey(x => x + 1);
  };

  const doSearch = (e) => {
    e.preventDefault();
    setPage(0);
    load();
  };

  return (
    <div className="mt-4">
      <form className="row g-2 align-items-end" onSubmit={doSearch}>
        <div className="col-md-3">
          <label className="form-label">Search</label>
          <input className="form-control" placeholder="title/description" value={q} onChange={e=>setQ(e.target.value)} />
        </div>
        <div className="col-md-3">
          <label className="form-label">Area</label>
          <input className="form-control" value={area} onChange={e=>setArea(e.target.value)} />
        </div>
        <div className="col-md-3">
          <label className="form-label">Status</label>
          <select className="form-select" value={status} onChange={e=>setStatus(e.target.value)}>
            <option value="">Any</option>
            <option>PENDING</option>
            <option>IN_PROGRESS</option>
            <option>RESOLVED</option>
            <option>REJECTED</option>
          </select>
        </div>
        <div className="col-md-3">
          <button className="btn btn-outline-primary w-100">Apply</button>
        </div>
      </form>

      <div className="table-responsive mt-3">
        <table className="table table-striped align-middle">
          <thead>
            <tr>
              <th>Title</th><th>Category</th><th>Area</th><th>Urgency</th><th>Status</th><th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {items.map(c => (
              <tr key={c.id}>
                <td>{c.title}</td>
                <td>{c.category}</td>
                <td>{c.area}</td>
                <td>{c.urgency}</td>
                <td><span className="badge text-bg-secondary">{c.status}</span></td>
                <td className="d-flex gap-2">
                  <button className="btn btn-sm btn-outline-warning" onClick={()=>updateStatus(c.id, "IN_PROGRESS")}>Start</button>
                  <button className="btn btn-sm btn-outline-success" onClick={()=>updateStatus(c.id, "RESOLVED")}>Resolve</button>
                  <button className="btn btn-sm btn-outline-danger" onClick={()=>updateStatus(c.id, "REJECTED")}>Reject</button>
                </td>
              </tr>
            ))}
            {!items.length && <tr><td colSpan="6" className="text-center text-muted py-4">No complaints found</td></tr>}
          </tbody>
        </table>
      </div>

      <div className="d-flex justify-content-between align-items-center">
        <span>Page {page+1} of {Math.max(1,totalPages)}</span>
        <div className="btn-group">
          <button disabled={page===0} className="btn btn-outline-secondary" onClick={()=>setPage(p=>p-1)}>Prev</button>
          <button disabled={page+1>=totalPages} className="btn btn-outline-secondary" onClick={()=>setPage(p=>p+1)}>Next</button>
        </div>
      </div>
    </div>
  );
}
