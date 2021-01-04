import React, { Component } from 'react';

export default class InputRefExample extends Component{
    constructor(props){
        super(props);
        this.state={user:''};
        this.userRef= React.createRef();
    }

    setUser=()=>{
        this.setState({user: this.userRef.current.value});
    }
    render(){
        return(<>
        <input type="text" ref={this.userRef}/>
        <button type="submit" onClick={()=>this.setUser()}>Submit</button>
        <p>{this.state.user}</p>
        </>);
    }
}