(require 'cljs.build.api)  ;; importa as funções do namespace cljs.build.api

(cljs.build.api/build              ;; chama a função build 
 "src"                             ;; primeiro parâmetro mostra onde estão os códigos fontes
 {:main 'hello-clojurescript.core  ;; define qual será o arquivo principal
  :output-to "out/main.js"})       ;; define qual será o arquivo JavaScript principal
