import { Link, NavLink } from "react-router-dom";

export default function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg bg-light">
      <div className="container">
        <Link className="navbar-brand fw-bold" to="/">Smart Complaint Tracker</Link>
        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nav">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div id="nav" className="collapse navbar-collapse">
          <ul className="navbar-nav ms-auto">
            <li className="nav-item fw-semibold"><NavLink className="nav-link" to="/complaints">Complaints</NavLink></li>
            <li className="nav-item fw-semibold"><NavLink className="nav-link" to="/dashboard">Dashboard</NavLink></li>
          </ul>
        </div>
      </div>
    </nav>
  );
}
