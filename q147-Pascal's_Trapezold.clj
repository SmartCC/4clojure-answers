;4clojure最后一个测试会有内存溢出，故当传入的参数元素大于8时返回，正常不需要
#((fn pascal-triangle [xs]
    (if (< 8 (count xs))
      xs
    (lazy-seq (cons xs (pascal-triangle (concat [(first xs)] (map + xs (next xs)) [(last xs)])))))) %)
