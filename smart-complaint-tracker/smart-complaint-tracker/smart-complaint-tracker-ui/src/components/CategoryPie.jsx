import { PieChart, Pie, Tooltip, ResponsiveContainer, Cell } from "recharts";
import { useEffect, useState } from "react";
import api from "../services/api";

export default function CategoryPie() {
  const [data, setData] = useState([]);

  useEffect(() => {
    api.get("/complaints/category-freq").then(res => {
      const arr = Object.entries(res.data).map(([name, value]) => ({ name, value }));
      setData(arr);
    });
  }, []);

  return (
    <div className="card shadow-sm">
      <div className="card-body">
        <h5 className="card-title">Complaints by Category</h5>
        <div style={{ width: "100%", height: 300 }}>
          <ResponsiveContainer>
            <PieChart>
              <Pie data={data} dataKey="value" nameKey="name" outerRadius={110} label>
                {data.map((_, idx) => <Cell key={idx} />)}
              </Pie>
              <Tooltip />
            </PieChart>
          </ResponsiveContainer>
        </div>
      </div>
    </div>
  );
}
