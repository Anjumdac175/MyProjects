// import { Link } from "react-router-dom";
// import hero from '../assets/main.png';

// export default function Home() {
//     return (
//         <>
//             {/* Hero Section */}
//             <section className="home-page">
//                 <div className="container-fluid">
//                     <div className="row align-items-center">
//                         <div className="col-lg-7 px-5">
//                             <h1 className="display-6 fw-bold mb-3">Stay Updated & Prepare for Your Career</h1>
//                             <p className="lead mb-4">Dev Daily brings you curated tech news and interview prep resources—everything
//                                 you need in one place. </p>

//                         {/* Buttons */}
//                             <div className="d-flex gap-3">
//                                 <Link className="btn btn-outline-primary btn-lg" to='/news'>Explore Tech News</Link>
//                                 <Link className="btn btn-outline-success btn-lg" to='/prep'>Start Interview Prep</Link>
//                             </div>
//                         </div>
//                         <div className="col-lg-5">
//                             <div className="hero-frame mt-5 p-3">
//                                 <img src={hero} alt="Coding Image" className="hero-image rounded-3"/>
//                             </div>
//                         </div>
//                     </div>
//                 </div>
//             </section>
//             {/* Cards Sections */}

//         </>
//     );
// }

import { useEffect } from "react";
import { Link } from "react-router-dom";
import hero from "../assets/herosection.png"; // put any image here (or use public path)

export default function Home() {
  useEffect(() => { document.title = "Home • Dev Daily"; }, []);

  // Simple placeholder data to match the wireframe
  const featuredArticles = [
    "AI chips: weekly roundup",
    "Node 22 LTS released",
    "React performance tips",
    "Kotlin vs Java in 2025",
  ];

  const interviewTips = [
    "Top 20 Java OOP Qs",
    "System design: caching",
    "DBMS joins explained",
    "Behavioral STAR answers",
  ];

  const popularTopics = [
    "GenAI & LLMs",
    "Cloud & DevOps",
    "Microservices",
    "Frontend Trends",
  ];

  const latestUpdates = [
    { id: 1, title: "Open-source highlights this week" },
    { id: 2, title: "Spring Boot security checklist" },
    { id: 3, title: "LeetCode patterns you must know" },
    { id: 4, title: "Docker & K8s quickstart for devs" },
  ];

  return (
    <div className="home-page">
      {/* HERO */}
      <section className="py-5 bg-light rounded-3">
        <div className="container">
          <div className="row g-4 align-items-center">
            <div className="col-lg-7">
              <h1 className="display-6 fw-bold mb-3">Stay Updated & Prepare for Your Career</h1>
              <p className="lead text-muted mb-4">
                Dev Daily brings you curated tech news and interview prep resources—everything
                you need in one place.
              </p>

              <div className="d-flex gap-2">
                <Link to="/news" className="btn btn-primary btn-lg">Explore Tech News</Link>
                <Link to="/prep" className="btn btn-outline-secondary btn-lg">Start Interview Prep</Link>
              </div>
            </div>

            <div className="col-lg-5">
              <div className="hero-frame ratio ratio-4x3">
                {/* You can use an <img> or keep the gray placeholder box */}
                <img src={hero} alt="Dev Daily hero" className="w-100 h-100 object-fit-cover rounded-3"/>
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* FEATURED SECTIONS (3 columns like the wireframe) */}
      <section className="container my-5">
        <div className="row g-4">
          <div className="col-md-4">
            <div className="card h-100">
              <div className="card-body">
                <h5 className="card-title">Featured Articles</h5>
                <ul className="list-unstyled mb-0 small">
                  {featuredArticles.map((t, i) => (
                    <li key={i} className="py-2 border-bottom">{t}</li>
                  ))}
                </ul>
              </div>
              <div className="card-footer bg-white">
                <Link to="/news" className="btn btn-sm btn-outline-primary">See all</Link>
              </div>
            </div>
          </div>

          <div className="col-md-4">
            <div className="card h-100">
              <div className="card-body">
                <h5 className="card-title">Interview Tips</h5>
                <ul className="list-unstyled mb-0 small">
                  {interviewTips.map((t, i) => (
                    <li key={i} className="py-2 border-bottom">{t}</li>
                  ))}
                </ul>
              </div>
              <div className="card-footer bg-white">
                <Link to="/prep" className="btn btn-sm btn-outline-primary">See all</Link>
              </div>
            </div>
          </div>

          <div className="col-md-4">
            <div className="card h-100">
              <div className="card-body">
                <h5 className="card-title">Popular Topics</h5>
                <ul className="list-unstyled mb-0 small">
                  {popularTopics.map((t, i) => (
                    <li key={i} className="py-2 border-bottom">{t}</li>
                  ))}
                </ul>
              </div>
              <div className="card-footer bg-white">
                <Link to="/trending" className="btn btn-sm btn-outline-primary">See all</Link>
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* LATEST UPDATES PREVIEW (small list like in the wireframe) */}
      <section className="container mb-5">
        <div className="card">
          <div className="card-body">
            <div className="d-flex justify-content-between align-items-center mb-2">
              <h5 className="card-title mb-0">Latest Updates</h5>
              <Link to="/news" className="btn btn-sm btn-light">See more</Link>
            </div>
            <ul className="list-group list-group-flush">
              {latestUpdates.map(item => (
                <li key={item.id} className="list-group-item d-flex justify-content-between align-items-center">
                  <span>{item.title}</span>
                  <Link to={`/article/${item.id}`} className="btn btn-sm btn-outline-secondary">Read</Link>
                </li>
              ))}
            </ul>
          </div>
        </div>
      </section>
    </div>
  );
}
