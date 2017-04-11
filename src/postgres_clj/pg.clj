(ns postgres-clj.pg
  (:require [clojure.java.jdbc :as sql]
            [clojure.string :as str]))

(def test-fields [[:test_id :serial]
                  [:data :text]])

(defn create-table [name]
  (sql/create-table-ddl name test-fields))

(defn drop-table [name]
  (sql/drop-table-ddl name))