import React from "react";
import quickSort from "../sortingAlgoritms/quickSort";

const QuickSort = (props) => {
    let a= [...props.arr];
    quickSort(a,0,a.length-1);
  return (
    <div>
      <h2>Quick Sort</h2>
      <div style={{ marginLeft: "1rem" }}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{a.toString()}</div>
      </div>
    </div>
  );
};

export default QuickSort;
