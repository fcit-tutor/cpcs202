# FCIT-TUTOR CPCS-202

This repository will contain all relevant material for CPCS-202.

The [fcit-tutor](https://t.me/fcit_tutor) have cleansed years of material for you and advanced it for you.

fcit-tutor students will benefit a lot

## Installation

Install [Git](https://git-scm.com/) first, then open your terminal. You only need to clone (download) this repository once.

The commands below create a `cpcs202` folder on your Desktop.

### Windows (PowerShell)

Open PowerShell and run:

```powershell
Set-Location ([Environment]::GetFolderPath('Desktop'))
git clone https://github.com/fcit-tutor/cpcs202.git
```

### macOS (Terminal)

Open Terminal and run:

```bash
mkdir -p "$HOME/Desktop"
cd "$HOME/Desktop"
git clone https://github.com/fcit-tutor/cpcs202.git
```

### GNU/Linux (Terminal)

Open your terminal and run. This uses your configured Desktop folder, or `~/Desktop` if none is configured:

```bash
desktop_dir="$(xdg-user-dir DESKTOP 2>/dev/null)"
desktop_dir="${desktop_dir:-$HOME/Desktop}"
mkdir -p "$desktop_dir"
cd "$desktop_dir"
git clone https://github.com/fcit-tutor/cpcs202.git
```

## Updates

All major updates will be announced in the [fcit-tutor Telegram channel](https://t.me/fcit_tutor). Join the channel to keep up with new materials and changes.

To get the latest materials, open your terminal and run the commands for your operating system below. Use your existing `cpcs202` folder; you do not need to clone (download) the repository again.

### Windows (PowerShell)

```powershell
Set-Location (Join-Path ([Environment]::GetFolderPath('Desktop')) 'cpcs202')
git pull --ff-only
```

### macOS (Terminal)

```bash
cd "$HOME/Desktop/cpcs202" && git pull --ff-only
```

### GNU/Linux (Terminal)

```bash
desktop_dir="$(xdg-user-dir DESKTOP 2>/dev/null)"
desktop_dir="${desktop_dir:-$HOME/Desktop}"
cd "$desktop_dir/cpcs202" && git pull --ff-only
```

If you cloned (saved) the repository somewhere else, open a terminal in that `cpcs202` folder and run `git pull --ff-only` there instead. If Git says `Already up to date.`, you already have the latest materials.

Keep your own answers and notes in a separate folder so updates do not interfere with your work. If Git refuses an update because of local changes, back up those changes before resolving the issue; do not delete your work.
