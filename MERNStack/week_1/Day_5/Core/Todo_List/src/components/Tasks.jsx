import React, { useState } from "react";

const Tasks = (props) => {
    const { value, task, tasks, setNewTasks } = props;

    const checkbox = (e) => {
        setNewTasks(
            tasks.map((item, idx) => {
                if (idx == value) {
                    item.completed ? (item.completed = false) : (item.completed = true);
                    return item;
                } else {
                    return item;
                }
            })
        );
    };

    const deleteTask = (e) => {
        e.preventDefault();
        setNewTasks(
            tasks.filter((task, index) => {
                return index !== value;
            })
        );
    };

    return (
        <div>
            {!task.completed ?
                <span>{task.text}</span> :
                <span className="completed">{task.text}</span>
            }
            <input type="checkbox" id="completed" onChange={checkbox} checked={task.completed}/>
            <button onClick={deleteTask}>Delete</button>
        </div>
    );
};

export default Tasks;