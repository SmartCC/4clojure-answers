(fn [chessboard]
    (let [nrow (count chessboard)
          ncol (count (nth chessboard 0))
          ; 根据下标获取元素
          get-coord (fn [x y] (nth (nth chessboard x) y))
          ; 相邻生命的坐标
          coords (fn [x y] (filter 
                              #(let [row-num (first %)
                                     col-num (last %)] 
                                ; 过滤越界的坐标
                                (and (>= row-num 0) 
                                     (>= col-num 0)
                                     (< row-num nrow) 
                                     (< col-num ncol)))
                              ; 当前坐标周围的八个坐标（笛卡尔积）
                              (for [xx [(dec x) x (inc x)]
                                    yy [(dec y) y (inc y)] 
                                        :when (not (and (= xx x) (= yy y)))]
                                    [xx yy])))
          ; 相邻的生命
          neighbors (fn [x y] (map (partial apply get-coord) (coords x y)))
          ; 相邻生命状态是live（#）的个数
          nlive (fn [x y] (count (filter #(= \# %) (neighbors x y))))
          ; 下一轮的状态（一维数组）
          result (for [x (range 0 nrow)
                       y (range 0 ncol)] 
                    (let [element (get-coord x y)
                          live-num (nlive x y)]
                        (if (= \# element)
                            ; live状态的生命周围如果有2个或3个生命是live的，则下轮继续存活，否则死亡
                            (if (or (< live-num 2) (> live-num 3)) \space \#)
                            ; die状态的生命周围如果有刚好3个生命是live的，则下轮复活，否则死亡
                            (if (= live-num 3) \# \space))))]
          ; 把结果转成4Clojure需要的形式
          (map (partial apply str) (partition ncol result))))
