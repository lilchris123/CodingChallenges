import React from 'react';

const InputUser = (props) => {
    const {onTextChange}= props
    return ( 
    <form>
        <label>Input User:</label>
        <input type="name" placeholder="enter user" onChange={onTextChange}/>
    </form> );
}
 
export default InputUser;