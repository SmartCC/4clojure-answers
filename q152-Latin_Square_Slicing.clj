#(case (-> (first %) first str)
   "1" {2 2}
   "3" {3 1,2 2}
   "8" {4 1,3 1,2 7}
   "B" {3 3}
   "A" (case (-> (second %) last str)
         "A" {6 1}
         "C" {4 1,2 4}
         {})
   {})
