<?php
function minDeletionSize($strs) {
    $length = strlen($strs);

    for($i = 0; $i < $length; $i++){

        $sorted = sort($strs[$i]);
        if($strs[$i] == $sorted ){
            return 0;
        }
        return $strs[$i];
    }
}

// Input: strs = ["cba","daf","ghi"]
// Output: 1
