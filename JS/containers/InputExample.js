import React, { Component } from 'react';
import InputUser from '../components/InputUser';

export default class InputExample extends Component{
    constructor(){
        super();
        this.state={user: '',count: 0};
        this.handleChange=this.handleChange.bind(this);
    }

    handleChange(event){
        this.setState({user: event.target.value});
        this.setState(prevState => {
            return {
                count: prevState.count +1
            }
        });
    }

    render(){
        return(
        <div>
            <InputUser onTextChange={this.handleChange}/>
            <p>{this.state.user}</p>
        </div>);
    }
}