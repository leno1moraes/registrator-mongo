import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

const url = "http://127.0.0.1:8001/registrator/";

function App() {
  const [registrators, setRegistrators] = useState([]);

  const [ip, setIp] = useState("");
  const [local, setLocal] = useState("");

  //LIST
  useEffect(() => {
    async function fetchData() {
      const res = await fetch(url + "list");

      const data = await res.json();

      setRegistrators(data);
    }

    fetchData();
  }, []);

  //ADD 
  const handleSubmit = async (e) => {
    e.preventDefault();

    const registrator = {
      ip,
      local,
    };

    const res = await fetch(url + "add", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(registrator),
    });

    const addedRegistrator = await res.json();

    setRegistrators((prevRegistrators) => [...prevRegistrators, addedRegistrator]);

    setIp("");
    setLocal("");
  };

  const handleDelete = async (id) => {
    await fetch(url + `delete/${id}`, {
      method: "DELETE",
    });
    setRegistrators(registrators.filter((reg) => reg.id !== id));
  };  

  return (
    <>

      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>

      <h3>Projeto Registrator</h3>

      <hr />
      
      <div className="add-registrator">
        <form onSubmit={handleSubmit}>
          <label htmlFor="ip">Endereço</label>
          <input type="text" value={ip} name='ip' onChange={(e) => setIp(e.target.value)}/>

          <label htmlFor="local">Local</label>
          <input type="text" value={local} name="local" onChange={(e) => setLocal(e.target.value)}/>

          <input type="submit" value="Enviar" />
        </form>
      </div>

      <hr />

      <table border="1">
        <thead>
          <tr>
            <th>Endereço</th>
            <th>Local</th>
            <th></th>
          </tr>
        </thead>

        <tbody>
          {registrators.map((registrator) => (
          <tr key={registrator.id} >
            <td> {registrator.ip} <input type="hidden" value='key={registrator.id}' /> </td>
            <td> {registrator.local} </td>
            <td> <button onClick={() => handleDelete(registrator.id)}>excluir</button> </td>
          </tr>          
          ))}
        </tbody>

      </table>
    </>
  )
}

export default App
