#(case (count %) 
   (2 7) false
   4 (if (= [2 5] (last %)) false true)
   true)
