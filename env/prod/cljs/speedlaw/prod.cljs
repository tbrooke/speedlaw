(ns speedlaw.app
  (:require [speedlaw.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
