(ns hello-clojure.core
  (:use compojure.core)
  (:use hiccup.core)
  (:use hello-clojure.main)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes app-routes
           (GET "/" [] (index-html))
           (route/resources "/")
           (route/not-found "<h1>a-durrrrr</h1>"))

(def handler (handler/site app-routes))

