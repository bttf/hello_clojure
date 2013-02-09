(defproject hello_clojure "0.1.0-SNAPSHOT"
            :description "making something with clojure & clojurescript"
            :url "http://chewbonga.com/hello_clojure"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}

            :source-paths ["src/clj"]
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [compojure "1.1.3"]
                           [hiccup "1.0.2"]]
            :plugins [[lein-cljsbuild "0.3.0"]
                      [lein-ring "0.8.2"]]
            :ring {:handler hello-clojure.core/handler}

            :cljsbuild {:builds 
                        [{:source-paths ["src/cljs"], 
                          :compiler 
                          {:pretty-print true,
                           :output-to "resources/public/js/hello_clojure.js",
                           :optimizations :whitespace}}]})
