(ns expsim.core.desktop-launcher
  (:require [expsim.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. expsim-game "expsim" 800 600)
  (Keyboard/enableRepeatEvents true))
