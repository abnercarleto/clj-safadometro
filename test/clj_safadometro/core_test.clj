(ns clj-safadometro.core-test
  (:require [clojure.test :refer :all]
            [clj-safadometro.core :refer :all]))

(deftest test-numero-triangular
  (testing "Should (numero-triangular 0) return 0"
    (is (= 0 (numero-triangular 0))))

  (testing "Should (numero-triangular 1) return 1"
    (is (= 1 (numero-triangular 1))))

  (testing "Should (numero-triangular 5) return 15"
    (is (= 15 (numero-triangular 5)))))

(deftest test-calc-safadeza
  (testing "Should calc safadeza"
    (is (= 45.94 (calc-safadeza 91 5 16)))))

(deftest test-calc-anjo
  (testing "Should calc anjo from safadeza"
    (is (= 54.06 (calc-anjo 45.94)))))
