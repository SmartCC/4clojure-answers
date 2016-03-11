(fn my-count [x] (if (nil? x) 0 (inc (my-count (next x)))))
