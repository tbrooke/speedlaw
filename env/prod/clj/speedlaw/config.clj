(ns speedlaw.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[speedlaw started successfully]=-"))
   :middleware identity})
