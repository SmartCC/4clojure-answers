#(case (count %) 
   (8 6) true 
   5 (if (some #{"share"} %) true false)
   false)
