import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Create = () => {
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState("")
    const [description, setDescription] = useState("")

    const navigate = useNavigate();

    const submitHandler = (e) => {

        e.preventDefault()
        const createdProduct = {
            title,
            price,
            description,
        };
        axios.post("http://localhost:8000/api/products", createdProduct)
            .then((res) => { navigate("/") })
            .catch((err) => console.log(err));
        setTitle("")
        setPrice("")
        setDescription("")
    };
    return (
        <div>
            <h1>Product Manager</h1>
            <form onSubmit={submitHandler}>
                <div>
                    <label >Title</label>
                    <input className='form-control' type="text" onChange={(e) => setTitle(e.target.value)} value={title} />
                </div>
                <div>
                    <label > Price</label>
                    <input className='form-control' type="number" onChange={(e) => { setPrice(e.target.value) }} value={price} />
                </div>
                <div>
                    <label >Description</label>
                    <input className='form-control' type="text" onChange={(e) => { setDescription(e.target.value) }} value={description} />
                </div>
                <button>create</button>
            </form>

        </div>
    )
}

export default Create