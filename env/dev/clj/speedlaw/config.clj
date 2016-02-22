(ns speedlaw.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [speedlaw.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[speedlaw started successfully using the development profile]=-"))
   :middleware wrap-dev})
