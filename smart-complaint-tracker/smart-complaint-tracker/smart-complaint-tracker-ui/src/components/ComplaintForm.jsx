import { useState } from "react";
import api from "../services/api";

const initial = {
  title: "",
  description: "",
  category: "",
  area: "",
  urgency: 1,
  status: "PENDING"
};

export default function ComplaintForm({ onCreated }) {
  const [form, setForm] = useState(initial);
  const [loading, setLoading] = useState(false);

  const onChange = e => setForm({ ...form, [e.target.name]: e.target.value });

  const submit = async (e) => {
    e.preventDefault();
    setLoading(true);
    try {
      await api.post("/complaints", form);
      setForm(initial);
      onCreated?.();
    } finally {
      setLoading(false);
    }
  };

  return (
    <form onSubmit={submit} className="border rounded p-3 shadow-sm">
      <div className="row g-2">
        <div className="col-md-6">
          <label className="form-label">Title</label>
          <input className="form-control" name="title" value={form.title} onChange={onChange} required />
        </div>
        <div className="col-md-6">
          <label className="form-label">Category</label>
          <input className="form-control" name="category" value={form.category} onChange={onChange} required />
        </div>
        <div className="col-md-6">
          <label className="form-label">Area</label>
          <input className="form-control" name="area" value={form.area} onChange={onChange} required />
        </div>
        <div className="col-md-6">
          <label className="form-label">Urgency (1-5)</label>
          <input type="number" min="1" max="5" className="form-control" name="urgency" value={form.urgency} onChange={onChange} required />
        </div>
        <div className="col-12">
          <label className="form-label">Description</label>
          <textarea className="form-control" rows="3" name="description" value={form.description} onChange={onChange} required />
        </div>
      </div>
      <div className="mt-3 d-flex gap-2">
        <button disabled={loading} className="btn btn-primary">{loading ? "Saving..." : "Add Complaint"}</button>
        <button type="button" className="btn btn-outline-secondary" onClick={() => setForm(initial)}>Reset</button>
      </div>
    </form>
  );
}
