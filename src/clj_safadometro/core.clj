(ns clj-safadometro.core
  (:gen-class))

;; Calcular somatorio
;; recebe um nomero inteiro soma com todos os anteriores
;; ex somatio de 5 -> 5 + 4 + 3 + 2 + 1 = 15
(defn somatorio [mes]
  (loop [n mes acc 0]
    (if (zero? n)
        acc
      (recur (dec n) (+ n acc)))))

(defn calc-safadeza [ano mes dia]
  (->> (- 50 dia)
    (* (/ ano 100))
    (+ (somatorio mes))
    (float)))

(defn calc-anjo [safadeza]
  (->> safadeza
    (- 100)
    (float)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [[str-dia str-mes str-ano] args
        dia (Integer/parseInt str-dia)
        mes (Integer/parseInt str-mes)
        ano (Integer/parseInt str-ano)
        vagabundo (calc-safadeza ano mes dia)
        anjo (calc-anjo vagabundo)]
    (println anjo "% anjo e " vagabundo "% vagabundo")))
