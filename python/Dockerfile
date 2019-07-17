
FROM python:2.7

WORKDIR /data/
COPY . /data/
RUN pip install -r requirements.txt

EXPOSE 8080

ENTRYPOINT python index.py