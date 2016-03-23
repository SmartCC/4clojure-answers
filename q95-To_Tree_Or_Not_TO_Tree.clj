(fn t [xs] (if (sequential? xs) (if (= 3 (count xs)) (and (t (second xs)) (t (last xs))) false) (if (nil? xs) true false)))
