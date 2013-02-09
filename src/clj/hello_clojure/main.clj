(ns hello-clojure.main
  (:use hiccup.core)
  (:use hiccup.page))

(defn index-head
  "the head section of index.html for hello-clojure"
  []
  (html 
    [:head
     [:title (str "hello-clojure by adnan")]
     (include-css "css/index.css")]))

(defn index-body
  "the body section of index.html for hello-clojure"
  []
  (html [:body
         [:h1 (str "well, here it is")]]))

(defn index-html
  "the index.html for hello-clojure"
  []
  (html [:html (index-head) (index-body)]))
