import React, { useState } from "react";
import API from "../api/api";
import Navbar from "./Navbar";

const PlacedStats = () => {
  const [batchYear, setBatchYear] = useState("");
  const [stats, setStats] = useState(null);

  const years = ["2021", "2022", "2023"];

  const fetchStats = async () => {
    try {
      const { data } = await API.get(`/placement/stats?batch_year=${batchYear}`);
      setStats(data);
      console.log("data:", data);
    } catch (err) {
      alert("Error fetching stats: " + (err.response?.data || "Unknown error"));
    }
  };

  return (
    <>
    <Navbar/>
    <div className="container mt-4">
      <h2 className="text-center mb-4">Placed/Unplaced Stats</h2>
      <div className="row justify-content-center">
        <div className="col-md-4">
          <div className="form-group">
            <label htmlFor="batchYear" className="form-label">
              Select Batch Year
            </label>
            <select
              id="batchYear"
              className="form-select"
              value={batchYear}
              onChange={(e) => setBatchYear(e.target.value)}
            >
              <option value="">Choose Year</option>
              {years.map((year, index) => (
                <option key={index} value={year}>
                  {year}
                </option>
              ))}
            </select>
          </div>
          <button
            className="btn btn-primary mt-3 w-100"
            onClick={fetchStats}
            disabled={!batchYear}
          >
            Fetch Stats
          </button>
        </div>
      </div>
      {stats && (
        <div className="row justify-content-center mt-4">
          <div className="col-md-6">
            <div className="card">
              <div className="card-body text-center">
                <h4 className="card-title">Statistics</h4>
                <p className="card-text">
                  <strong>Placed Students:</strong> {stats.placed_students}
                </p>
                <p className="card-text">
                  <strong>Unplaced Students:</strong> {stats.unplaced_students}
                </p>
              </div>
            </div>
          </div>
        </div>
      )}
    </div>
    </>
  );
};

export default PlacedStats;
