(fn [n] (filter #(let [x (vec (str %)),n (-> (count x) (/ 2) int)] (= (subvec x 0 n) (subvec (vec (reverse x)) 0 n))) (iterate inc n)))
