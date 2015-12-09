(ns clj-safadometro.core
  (:gen-class))

;; Calcular somatorio
;; recebe um nomero inteiro soma com todos os anteriores
;; ex (somatorio 5) -> 5 + 4 + 3 + 2 + 1 = 15
(defn somatorio
  [^long mes]
  (loop [n mes acc 0]
    (if (>= 0 n)
        acc
      (recur (dec n) (+ n acc)))))

(defn calc-safadeza
  [^long ano ^long mes ^long dia]
  (->> (- 50 dia)
    (* (/ ano 100))
    (+ (somatorio mes))
    (double)))

(defn calc-anjo
  [^double safadeza]
  (double (- 100 safadeza)))


(defn -main
  "Calcula o percentual anjo e vagabundo de uma pessoa pela data de nascimento"
  [& args]
  (let [[str-dia str-mes str-ano] args
        dia (Integer/parseInt str-dia)
        mes (Integer/parseInt str-mes)
        ano (Integer/parseInt str-ano)
        vagabundo (calc-safadeza ano mes dia)
        anjo (calc-anjo vagabundo)]
    (println anjo "% anjo e " vagabundo "% vagabundo")))
