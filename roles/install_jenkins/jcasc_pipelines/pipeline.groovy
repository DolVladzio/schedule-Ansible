// #############################################################################
pipelineJob('prod-frontend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/DolVladzio/schedule_frontend.git')
          }
          branches('*/main')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}

pipelineJob('dev-frontend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/DolVladzio/schedule_frontend.git')
          }
          branches('*/dev')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}
// #############################################################################
// Backend
pipelineJob('prod-backend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/DolVladzio/schedule_backend.git')
          }
          branches('*/main')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}

pipelineJob('dev-backend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/DolVladzio/schedule_backend.git')
          }
          branches('*/dev')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}
// #############################################################################