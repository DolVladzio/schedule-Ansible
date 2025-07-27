// FRONTEND/BACKEND jobs #######################################################
def jobs = [
  // FRONTEND
  [name: 'prod-frontend', repo: 'https://github.com/DolVladzio/schedule_frontend.git', branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-frontend',  repo: 'https://github.com/DolVladzio/schedule_frontend.git', branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile'],
  // BACKEND 
  [name: 'prod-backend',  repo: 'https://github.com/DolVladzio/schedule_backend.git',  branch: '*/main', file_name: 'Jenkinsfiles/Jenkinsfile'],
  [name: 'dev-backend',   repo: 'https://github.com/DolVladzio/schedule_backend.git',  branch: '*/dev',  file_name: 'Jenkinsfiles/dev-Jenkinsfile']
]

jobs.each { job ->

  pipelineJob(job.name) {
    definition {
      cpsScm {
        scm {
          git {
            remote {
              url(job.repo)
            }
            branches(job.branch)
          }
        }
        scriptPath(job.file_name)
      }
    }
  }
}

// TERRAFORM ###################################################################
// ANSIBLE #####################################################################
