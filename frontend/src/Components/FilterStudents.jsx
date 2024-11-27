import React, { useState } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./Navbar";

const FilterStudents = () => {
  const [organisation, setOrganisation] = useState("");
  const [domain, setDomain] = useState("");
  const [batchYear, setBatchYear] = useState("");
  const [students, setStudents] = useState([]);
  const [error, setError] = useState("");

  const organisations = ["Google", "Microsoft", "Intel"];
  const domains = ["Computer Science", "Information Technology", "Electronics", "Mechanical Engineering"];
  const years = ["2021", "2022", "2023"];

  const handleFilter = async () => {
    setError("");
    setStudents([]);

    const token = localStorage.getItem("token");
    if (!token) {
      setError("No valid authentication token found. Please log in.");
      return;
    }

    try {
      const response = await axios.get("http://localhost:8080/api/v1/placement/filter", {
        params: { organisationName: organisation, domainName: domain, batchYear: parseInt(batchYear, 10) },
        headers: {
          Authorization: `Bearer ${token}`,
        },
      });
      setStudents(response.data);
    } catch (err) {
      setError(err.response?.data || "An error occurred while fetching data.");
    }
  };

  return (
    <>
    <Navbar/>
    <div className="container mt-5">
      <h2 className="text-center mb-4">Filter Students</h2>

      <div className="card p-4 shadow">
        <div className="row mb-3">
          <div className="col-md-4">
            <label htmlFor="organisation" className="form-label">
              Organisation Name
            </label>
            <select
              id="organisation"
              className="form-select"
              value={organisation}
              onChange={(e) => setOrganisation(e.target.value)}
            >
              <option value="">Select Organisation</option>
              {organisations.map((org, index) => (
                <option key={index} value={org}>
                  {org}
                </option>
              ))}
            </select>
          </div>
          <div className="col-md-4">
            <label htmlFor="domain" className="form-label">
              Domain Name
            </label>
            <select
              id="domain"
              className="form-select"
              value={domain}
              onChange={(e) => setDomain(e.target.value)}
            >
              <option value="">Select Domain</option>
              {domains.map((d, index) => (
                <option key={index} value={d}>
                  {d}
                </option>
              ))}
            </select>
          </div>
          <div className="col-md-4">
            <label htmlFor="batchYear" className="form-label">
              Batch Year
            </label>
            <select
              id="batchYear"
              className="form-select"
              value={batchYear}
              onChange={(e) => setBatchYear(e.target.value)}
            >
              <option value="">Select Year</option>
              {years.map((year, index) => (
                <option key={index} value={year}>
                  {year}
                </option>
              ))}
            </select>
          </div>
        </div>

        <div className="text-center">
          <button className="btn btn-primary w-100" onClick={handleFilter}>
            Filter
          </button>
        </div>
      </div>

      {error && <p className="text-danger text-center mt-3">{error}</p>}

      {students.length > 0 && (
        <div className="mt-4">
          <table className="table table-bordered table-striped">
            <thead className="table-dark">
              <tr>
                <th>Student ID</th>
                <th>Name</th>
                <th>Domain</th>
                <th>Batch Year</th>
              </tr>
            </thead>
            <tbody>
              {students.map((student, index) => (
                <tr key={index}>
                  <td>{student.student_id}</td>
                  <td>{student.name}</td>
                  <td>{student.domain.domain_name}</td>
                  <td>{student.batch_year}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
    </>
  );
};

export default FilterStudents;
