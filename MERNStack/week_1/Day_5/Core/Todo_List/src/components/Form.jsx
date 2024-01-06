import React, { useState} from 'react';

const Form = (props) => {
    const { tasks, addTasks } = props;

    const [task, setTask] = useState({ text: '' });

    const onChange = (e) => {
        setTask({ ...task, text: e.target.value });
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        addTasks([...tasks, { text: task.text, completed: false }]);
        setTask({ ...task, text: "" });
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <label htmlFor="">Add a task here:</label>
                <input type="text" onChange={onChange} value={task.text} />
                <button>Add Task</button>
            </form>
        </>
    );
}

export default Form;