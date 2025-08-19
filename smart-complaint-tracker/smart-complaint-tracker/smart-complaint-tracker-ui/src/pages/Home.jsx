import './Home.css';
export default function Home() {
  return (
    <div className="home-container">
      {/* Dark overlay */}
      <div className="overlay"></div>

      {/* Content */}
      <div className="home-content text-center">
        <h1 className="project-title">Smart Complaint Tracker</h1>
        <p className="project-tagline">
          Add, track, and analyze complaints with urgency, area & category filters.
        </p>
        <a href="/Complaints" className="btn raise-btn">
          Raise Complaint
        </a>
      </div>
    </div>
  );
}
