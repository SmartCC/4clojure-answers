#(case %
   "the" (if (= (first (first %2)) \c) false true)
   "joy" (if (= (nth (first %2) 2) \o) false true)
   true)
