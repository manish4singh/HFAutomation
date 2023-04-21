FROM gradle:6.7.1-jdk8

USER root

RUN apt-get update && apt-get install ssmtp jq -y
# WORKDIR /test-automation

# COPY . .

# RUN gradle task codegen
