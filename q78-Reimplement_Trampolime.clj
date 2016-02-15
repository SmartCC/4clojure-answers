#(loop [x (% %2)] (if (fn? x) (recur (x)) x))
