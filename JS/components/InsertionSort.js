import React from "react";
import insertionSort from "../sortingAlgoritms/insertionSort";

const InsertionSort = (props) => {
  return (
    <div>
      <h2>Insertion Sort</h2>
      <div style={{ marginLeft: "1rem" }}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{insertionSort(props.arr).toString()}</div>
      </div>
    </div>
  );
};

export default InsertionSort;
