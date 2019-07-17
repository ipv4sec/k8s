FROM php:7.3-fpm


WORKDIR    /var/www/
ADD index.php /var/www/

EXPOSE     8080

ENTRYPOINT ["php", "-S", "0.0.0.0:8080"]