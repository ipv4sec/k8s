<?php
   class Language {
       public $name = "";
   }
   $e = new Language();
   $e->name = "php";

   echo json_encode($e);
?>