import ComplaintForm from "../components/ComplaintForm.jsx";
import ComplaintTable from "../components/ComplaintTable.jsx";
import { useState } from "react";

export default function Complaints(){
  const [k, setK] = useState(0);
  return (
    <>
      <h3 className="mb-3">Manage Complaints</h3>
      <ComplaintForm onCreated={()=>setK(x=>x+1)} />
      <div key={k}><ComplaintTable /></div>
    </>
  );
}
