#(case (count %&)
   1 3
   2 4
   ((fn [x] (if (= (nth (first x) 3) 27) 64 7)) %&))
