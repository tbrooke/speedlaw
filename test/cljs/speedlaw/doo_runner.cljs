(ns speedlaw.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [speedlaw.core-test]))

(doo-tests 'speedlaw.core-test)

