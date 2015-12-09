(ns clj-safadometro.core-test
  (:require [clojure.test :refer :all]
            [clj-safadometro.core :refer :all]))

(deftest test-somatorio
  (testing "Should (somatorio 0) return 0"
    (is (= 0 (somatorio 0))))

  (testing "Should (somatorio 1) return 1"
    (is (= 1 (somatorio 1))))

  (testing "Should (somatorio 5) return 15"
    (is (= 15 (somatorio 5))))

  (testing "Should negative number as argumento to somatorio return 0"
    (is (= 0 (somatorio -20)))))

(deftest test-calc-safadeza
  (testing "Should calc safadeza"
    (is (= 45.94 (calc-safadeza 91 5 16)))))

(deftest test-calc-anjo
  (testing "Should calc anjo from safadeza"
    (is (= 54.06 (calc-anjo 45.94)))))
