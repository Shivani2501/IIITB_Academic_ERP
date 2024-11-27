import React from "react";
import { useNavigate } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./Navbar";

const Dashboard = () => {
  const navigate = useNavigate();

  return (
    <>
    <Navbar/>
    <div className="container mt-5">
      <h2 className="text-center mb-4">Dashboard</h2>
      <div className="row justify-content-center">
        <div className="col-md-4">
          <div className="card shadow">
            <div className="card-body text-center">
              <h5 className="card-title">Placed/Unplaced Stats</h5>
              <p className="card-text">
                View statistics about students who are placed and unplaced.
              </p>
              <button
                className="btn btn-primary w-100"
                onClick={() => navigate("/stats")}
              >
                View Stats
              </button>
            </div>
          </div>
        </div>
        <div className="col-md-4">
          <div className="card shadow">
            <div className="card-body text-center">
              <h5 className="card-title">Filter Students</h5>
              <p className="card-text">
                Filter students based on organisation, domain, and batch year.
              </p>
              <button
                className="btn btn-success w-100"
                onClick={() => navigate("/filter")}
              >
                Filter Students
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
    </>
  );
};

export default Dashboard;
