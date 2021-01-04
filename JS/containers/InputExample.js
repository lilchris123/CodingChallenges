import React, { Component } from 'react';
import InputUser from '../components/InputUser';

export default class InputExample extends Component{
    constructor(){
        super();
        this.state={user: ''};
        this.handleChange=this.handleChange.bind(this);
    }

    handleChange(event){
        this.setState({user: event.target.value});
    }

    render(){
        return(
        <div>
            <InputUser onTextChange={this.handleChange}/>
            <p>{this.state.user}</p>
        </div>);
    }
}