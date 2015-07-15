
(require '[clojure.zip :as z])

(defn tree-finder
  "找到所在的点"
  [t p]
  (if (= (z/node t) p)
    t
    (if ((complement z/end?) t)
      (tree-finder (z/next t) p))))

(defn get-parents
  "获取父节点，并将邻居节点赋予父节点"
  [n]
  (if-let [p (z/up n)]
    (do
      (->> n z/node (println "node"))
      (->> (remove #(= % (z/node n)) (z/node p)) (println "link"))
      (let [new-node (-> (remove #(= % (z/node n)) (z/node p)) vec)]
        (if-let [pn (get-parents p)] (conj new-node pn) new-node)))))

(defn tree-reparent
  "主函数"
  [t o]
  (let [new-root (tree-finder (z/seq-zip t) o)]
    (cons (z/node new-root) (get-parents new-root))))


(defn tree-reparent
  "合并到一起的主函数"
  [o t]
  (letfn [(tree-finder [t p]
            (if (= (z/node t) p)
              t
              (if ((complement z/end?) t)
                (tree-finder (z/next t) p))))
          (get-parents [n]
            (if-let [p (z/up n)]
              (let [new-node (-> (remove #(= % (z/node n)) (z/node p)) vec)]
                (if-let [pn (get-parents p)] (conj new-node pn) new-node))))]
    (let [new-root (tree-finder (z/seq-zip t) o)]
      (cons (z/node new-root) (get-parents new-root)))))
