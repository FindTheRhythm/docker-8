# Используем официальный образ Jenkins LTS
FROM jenkins/jenkins:lts

# Устанавливаем плагины Jenkins, если нужно (по желанию)
# RUN jenkins-plugin-cli --plugins <названия плагинов>

# Настройка прав и директорий
USER root
RUN mkdir -p /var/jenkins_home && chown -R jenkins:jenkins /var/jenkins_home
USER jenkins
RUN jenkins-plugin-cli --plugins "git pipeline docker-workflow"
