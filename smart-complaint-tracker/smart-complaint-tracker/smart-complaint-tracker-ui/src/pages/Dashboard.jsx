import { useEffect, useState } from "react";
import api from "../services/api";
import CategoryPie from "../components/CategoryPie.jsx";

export default function Dashboard(){
  const [urgent, setUrgent] = useState([]);

  useEffect(() => {
    api.get("/complaints/urgent?limit=5").then(res => setUrgent(res.data));
  }, []);

  return (
    <>
      <h3 className="mb-3">Dashboard</h3>
      <div className="row g-3">
        <div className="col-lg-6"><CategoryPie /></div>
        <div className="col-lg-6">
          <div className="card shadow-sm">
            <div className="card-body">
              <h5 className="card-title">Top 5 Urgent Complaints</h5>
              <ul className="list-group list-group-flush">
                {urgent.map(u => (
                  <li key={u.id} className="list-group-item d-flex justify-content-between">
                    <span>
                      <strong>{u.title}</strong><br/>
                      <small className="text-muted">{u.category} • {u.area}</small>
                    </span>
                    <span className="badge text-bg-danger align-self-center">Urgency {u.urgency}</span>
                  </li>
                ))}
                {!urgent.length && <li className="list-group-item text-muted">No data</li>}
              </ul>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}
